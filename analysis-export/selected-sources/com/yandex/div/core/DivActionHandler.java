package com.yandex.div.core;

import android.net.Uri;
import android.view.KeyEvent;
import com.sun.mail.imap.IMAPStore;
import com.yandex.div.core.actions.DivActionTypedHandlerProxy;
import com.yandex.div.core.downloader.DivDownloadActionHandler;
import com.yandex.div.core.expression.storedvalues.StoredValuesActionHandler;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.state.PathFormatException;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.ViewLocator;
import com.yandex.div.core.view2.divs.widgets.DivHolderView;
import com.yandex.div.core.view2.items.DivItemChangeActionHandler;
import com.yandex.div.data.VariableMutationException;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.core.VariableMutationHandler;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import org.mozilla.javascript.ES6Iterator;
import p607i9.C12679k0;
import p607i9.InterfaceC12240Kb;
import p622j.C15292t;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
public class DivActionHandler {
    private static ExpressionResolver findExpressionResolverById(Div2View div2View, String str) {
        BindingContext bindingContext;
        if (str == null) {
            return null;
        }
        KeyEvent.Callback callbackFindSingleViewWithTag = ViewLocator.findSingleViewWithTag(div2View, str);
        if (!(callbackFindSingleViewWithTag instanceof DivHolderView) || (bindingContext = ((DivHolderView) callbackFindSingleViewWithTag).getBindingContext()) == null) {
            return null;
        }
        return bindingContext.getExpressionResolver();
    }

    private boolean handleActionInternal(String str, Uri uri, DivViewFacade divViewFacade, ExpressionResolver expressionResolver) {
        Div2View div2View;
        String authority = uri.getAuthority();
        if ("set_state".equals(authority)) {
            String queryParameter = uri.getQueryParameter("state_id");
            if (queryParameter == null) {
                Assert.fail("state_id param is required");
                return false;
            }
            try {
                divViewFacade.switchToState(DivStatePath.parse(queryParameter), uri.getBooleanQueryParameter("temporary", true));
                return true;
            } catch (PathFormatException e10) {
                Assert.fail("Invalid format of ".concat(queryParameter), e10);
                return false;
            }
        }
        if ("show_tooltip".equals(authority)) {
            String queryParameter2 = uri.getQueryParameter("id");
            if (queryParameter2 == null) {
                Assert.fail("id param is required");
                return false;
            }
            divViewFacade.showTooltip(queryParameter2, uri.getBooleanQueryParameter("multiple", false));
            return true;
        }
        if ("hide_tooltip".equals(authority)) {
            String queryParameter3 = uri.getQueryParameter("id");
            if (queryParameter3 == null) {
                Assert.fail("id param is required");
                return false;
            }
            divViewFacade.hideTooltip(queryParameter3);
            return true;
        }
        if ("set_variable".equals(authority)) {
            String queryParameter4 = uri.getQueryParameter(IMAPStore.ID_NAME);
            if (queryParameter4 == null) {
                Assert.fail("name param is required");
                return false;
            }
            String queryParameter5 = uri.getQueryParameter(ES6Iterator.VALUE_PROPERTY);
            if (queryParameter5 == null) {
                Assert.fail("value param unspecified for ".concat(queryParameter4));
                return false;
            }
            div2View = divViewFacade instanceof Div2View ? (Div2View) divViewFacade : null;
            if (div2View == null) {
                StringBuilder sbM18009a = C15292t.m18009a("Variable '", queryParameter4, "' mutation failed! View(");
                sbM18009a.append(divViewFacade.getClass().getSimpleName());
                sbM18009a.append(") not supports variables!");
                Assert.fail(sbM18009a.toString());
                return false;
            }
            try {
                VariableMutationHandler.setVariable(div2View, queryParameter4, queryParameter5, expressionResolver);
                return true;
            } catch (VariableMutationException e11) {
                StringBuilder sbM18009a2 = C15292t.m18009a("Variable '", queryParameter4, "' mutation failed: ");
                sbM18009a2.append(e11.getMessage());
                Assert.fail(sbM18009a2.toString(), e11);
                return false;
            }
        }
        if ("timer".equals(authority)) {
            String queryParameter6 = uri.getQueryParameter("id");
            if (queryParameter6 == null) {
                Assert.fail("id param is required");
                return false;
            }
            String queryParameter7 = uri.getQueryParameter("action");
            if (queryParameter7 == null) {
                Assert.fail("action param is required");
                return false;
            }
            div2View = divViewFacade instanceof Div2View ? (Div2View) divViewFacade : null;
            if (div2View != null) {
                div2View.applyTimerCommand(queryParameter6, queryParameter7);
                return true;
            }
            StringBuilder sbM18009a3 = C15292t.m18009a("Timer '", queryParameter6, "' state changing failed! View(");
            sbM18009a3.append(divViewFacade.getClass().getSimpleName());
            sbM18009a3.append(") not supports timers!");
            Assert.fail(sbM18009a3.toString());
            return false;
        }
        if (!"video".equals(authority)) {
            if (DivItemChangeActionHandler.canHandle(authority)) {
                return DivItemChangeActionHandler.handleAction(uri, divViewFacade, expressionResolver);
            }
            if (StoredValuesActionHandler.canHandle(authority)) {
                return StoredValuesActionHandler.handleAction(uri, divViewFacade);
            }
            return false;
        }
        div2View = divViewFacade instanceof Div2View ? (Div2View) divViewFacade : null;
        if (div2View == null) {
            Assert.fail("Handler view is not instance of Div2View");
            return false;
        }
        String queryParameter8 = uri.getQueryParameter("id");
        if (queryParameter8 == null) {
            Assert.fail("Video action has no id param");
            return false;
        }
        String queryParameter9 = uri.getQueryParameter("action");
        if (queryParameter9 != null) {
            return div2View.applyVideoCommand(queryParameter8, queryParameter9, expressionResolver);
        }
        Assert.fail("Video action has no action param");
        return false;
    }

    public boolean getUseActionUid() {
        return false;
    }

    public boolean handleAction(C12679k0 c12679k0, DivViewFacade divViewFacade, ExpressionResolver expressionResolver) {
        Div2View div2View = (Div2View) divViewFacade;
        ExpressionResolver expressionResolverFindExpressionResolverById = findExpressionResolverById(div2View, c12679k0.f42040h);
        if (expressionResolverFindExpressionResolverById == null) {
            expressionResolverFindExpressionResolverById = expressionResolver;
        }
        if (DivActionTypedHandlerProxy.handleAction(c12679k0, divViewFacade, expressionResolverFindExpressionResolverById)) {
            return true;
        }
        Expression<Uri> expression = c12679k0.f42043k;
        Uri uriEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        return DivDownloadActionHandler.canHandle(uriEvaluate, divViewFacade) ? DivDownloadActionHandler.handleAction(c12679k0, div2View, expressionResolverFindExpressionResolverById) : handleAction(c12679k0.f42040h, uriEvaluate, divViewFacade, expressionResolverFindExpressionResolverById);
    }

    public boolean handleActionWithReason(C12679k0 c12679k0, DivViewFacade divViewFacade, ExpressionResolver expressionResolver, String str) {
        return handleAction(c12679k0, divViewFacade, expressionResolver);
    }

    public boolean handleActionWithReason(C12679k0 c12679k0, DivViewFacade divViewFacade, ExpressionResolver expressionResolver, String str, String str2) {
        return handleAction(c12679k0, divViewFacade, expressionResolver, str);
    }

    public boolean handleAction(C12679k0 c12679k0, DivViewFacade divViewFacade, ExpressionResolver expressionResolver, String str) {
        return handleAction(c12679k0, divViewFacade, expressionResolver);
    }

    public boolean handleAction(InterfaceC12240Kb interfaceC12240Kb, DivViewFacade divViewFacade, ExpressionResolver expressionResolver) {
        Div2View div2View = (Div2View) divViewFacade;
        ExpressionResolver expressionResolverFindExpressionResolverById = findExpressionResolverById(div2View, interfaceC12240Kb.mo14163e());
        if (expressionResolverFindExpressionResolverById == null) {
            expressionResolverFindExpressionResolverById = expressionResolver;
        }
        if (DivActionTypedHandlerProxy.handleVisibilityAction(interfaceC12240Kb, divViewFacade, expressionResolverFindExpressionResolverById)) {
            return true;
        }
        Uri uriEvaluate = interfaceC12240Kb.getUrl() != null ? interfaceC12240Kb.getUrl().evaluate(expressionResolver) : null;
        if (DivDownloadActionHandler.canHandle(uriEvaluate, divViewFacade)) {
            return DivDownloadActionHandler.handleVisibilityAction(interfaceC12240Kb, div2View, expressionResolverFindExpressionResolverById);
        }
        return handleAction(interfaceC12240Kb.mo14163e(), uriEvaluate, divViewFacade, expressionResolver);
    }

    public boolean handleAction(InterfaceC12240Kb interfaceC12240Kb, DivViewFacade divViewFacade, ExpressionResolver expressionResolver, String str) {
        return handleAction(interfaceC12240Kb, divViewFacade, expressionResolver);
    }

    private boolean handleAction(String str, Uri uri, DivViewFacade divViewFacade, ExpressionResolver expressionResolver) {
        if (uri != null && "div-action".equals(uri.getScheme())) {
            return handleActionInternal(str, uri, divViewFacade, expressionResolver);
        }
        return false;
    }
}
