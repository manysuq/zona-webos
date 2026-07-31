package javax.mail.internet;

import com.sun.mail.util.MailLogger;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.DateFormatSymbols;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.logging.Level;
import p055D0.C0941K;
import p450Z.C6619b;
import p470a1.C6989a;
import p623j$.util.DesugarTimeZone;

/* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
/* JADX INFO: loaded from: classes3.dex */
public class MailDateFormat extends SimpleDateFormat {
    private static final int LEAP_SECOND = 60;
    private static final String PATTERN = "EEE, d MMM yyyy HH:mm:ss Z (z)";
    private static final int UNKNOWN_DAY_NAME = -1;
    private static final long serialVersionUID = -8148227605210628779L;
    private static final MailLogger LOGGER = new MailLogger((Class<?>) MailDateFormat.class, "DEBUG", false, System.out);
    private static final TimeZone UTC = DesugarTimeZone.getTimeZone("UTC");

    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public static abstract class AbstractDateParser {
        static final int INVALID_CHAR = -1;
        static final int MAX_YEAR_DIGITS = 8;
        final ParsePosition pos;
        final String text;

        public AbstractDateParser(String str, ParsePosition parsePosition) {
            this.text = str;
            this.pos = parsePosition;
        }

        public final int getAsciiDigit() {
            int i10 = getChar();
            if (48 <= i10 && i10 <= 57) {
                return Character.digit((char) i10, 10);
            }
            if (i10 != -1) {
                ParsePosition parsePosition = this.pos;
                parsePosition.setIndex(parsePosition.getIndex() - 1);
            }
            return -1;
        }

        public final int getChar() {
            if (this.pos.getIndex() >= this.text.length()) {
                return -1;
            }
            char cCharAt = this.text.charAt(this.pos.getIndex());
            ParsePosition parsePosition = this.pos;
            parsePosition.setIndex(parsePosition.getIndex() + 1);
            return cCharAt;
        }

        public boolean isValidZoneOffset(int i10) {
            return i10 % 100 < 60;
        }

        public final Date parse() {
            int index = this.pos.getIndex();
            try {
                return tryParse();
            } catch (Exception e10) {
                if (MailDateFormat.LOGGER.isLoggable(Level.FINE)) {
                    MailDateFormat.LOGGER.log(Level.FINE, C6989a.m7848b(this.text, "'", new StringBuilder("Bad date: '")), (Throwable) e10);
                }
                ParsePosition parsePosition = this.pos;
                parsePosition.setErrorIndex(parsePosition.getIndex());
                this.pos.setIndex(index);
                return null;
            }
        }

        public final int parseAsciiDigits(int i10) {
            return parseAsciiDigits(i10, i10);
        }

        public final void parseChar(char c10) throws java.text.ParseException {
            if (skipChar(c10)) {
                return;
            }
            throw new java.text.ParseException("Invalid input: expected '" + c10 + "'", this.pos.getIndex());
        }

        public final int parseDayName() throws java.text.ParseException {
            int i10 = getChar();
            if (i10 == -1) {
                throw new java.text.ParseException("Invalid day-name", this.pos.getIndex());
            }
            if (i10 != 70) {
                if (i10 != 77) {
                    if (i10 != 87) {
                        if (i10 != 83) {
                            if (i10 == 84) {
                                if (skipPair('u', 'e')) {
                                    return 3;
                                }
                                if (skipPair('h', 'u')) {
                                    return 5;
                                }
                            }
                        } else {
                            if (skipPair('u', 'n')) {
                                return 1;
                            }
                            if (skipPair('a', 't')) {
                                return 7;
                            }
                        }
                    } else if (skipPair('e', 'd')) {
                        return 4;
                    }
                } else if (skipPair('o', 'n')) {
                    return 2;
                }
            } else if (skipPair('r', 'i')) {
                return 6;
            }
            ParsePosition parsePosition = this.pos;
            parsePosition.setIndex(parsePosition.getIndex() - 1);
            throw new java.text.ParseException("Invalid day-name", this.pos.getIndex());
        }

        public final void parseFoldingWhiteSpace() throws java.text.ParseException {
            if (!skipFoldingWhiteSpace()) {
                throw new java.text.ParseException("Invalid input: expected FWS", this.pos.getIndex());
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:100:0x0128  */
        /* JADX WARN: Code duplicated, block: B:102:0x012e  */
        /* JADX WARN: Code duplicated, block: B:105:0x0136 A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Code duplicated, block: B:107:0x0139  */
        /* JADX WARN: Code duplicated, block: B:109:0x0141  */
        /* JADX WARN: Code duplicated, block: B:115:0x0152  */
        /* JADX WARN: Code duplicated, block: B:121:0x0171 A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Code duplicated, block: B:123:0x0173 A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Code duplicated, block: B:21:0x0042  */
        /* JADX WARN: Code duplicated, block: B:23:0x0048  */
        /* JADX WARN: Code duplicated, block: B:26:0x0050 A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Code duplicated, block: B:28:0x0053  */
        /* JADX WARN: Code duplicated, block: B:30:0x005b  */
        /* JADX WARN: Code duplicated, block: B:33:0x0065 A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Code duplicated, block: B:35:0x0068  */
        /* JADX WARN: Code duplicated, block: B:37:0x0072  */
        /* JADX WARN: Code duplicated, block: B:40:0x007e A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Code duplicated, block: B:42:0x0081  */
        /* JADX WARN: Code duplicated, block: B:47:0x008f  */
        /* JADX WARN: Code duplicated, block: B:49:0x0095  */
        /* JADX WARN: Code duplicated, block: B:50:0x0097  */
        /* JADX WARN: Code duplicated, block: B:55:0x00a6  */
        /* JADX WARN: Code duplicated, block: B:56:0x00a8  */
        /* JADX WARN: Code duplicated, block: B:60:0x00bd A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Code duplicated, block: B:62:0x00bf A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Code duplicated, block: B:64:0x00c1  */
        /* JADX WARN: Code duplicated, block: B:77:0x00e4  */
        /* JADX WARN: Code duplicated, block: B:79:0x00ec  */
        /* JADX WARN: Code duplicated, block: B:80:0x00ee  */
        /* JADX WARN: Code duplicated, block: B:85:0x00fd  */
        /* JADX WARN: Code duplicated, block: B:86:0x00ff  */
        /* JADX WARN: Code duplicated, block: B:90:0x0111 A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Code duplicated, block: B:92:0x0113 A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Code duplicated, block: B:94:0x0115  */
        public final int parseMonthName(boolean z10) throws java.text.ParseException {
            switch (getChar()) {
                case -1:
                    throw new java.text.ParseException("Invalid month", this.pos.getIndex());
                case 65:
                    if (!skipPair('u', 'g')) {
                        return 7;
                    }
                    if (z10 && skipAlternativePair('u', 'U', 'g', 'G')) {
                        return 7;
                    }
                    if (!skipPair('p', 'r')) {
                        return 3;
                    }
                    if (!z10 && skipAlternativePair('p', 'P', 'r', 'R')) {
                        return 3;
                    }
                    ParsePosition parsePosition = this.pos;
                    parsePosition.setIndex(parsePosition.getIndex() - 1);
                    throw new java.text.ParseException("Invalid month", this.pos.getIndex());
                case 68:
                    if (!skipPair('e', 'c')) {
                        return 11;
                    }
                    if (!z10 && skipAlternativePair('e', 'E', 'c', 'C')) {
                        return 11;
                    }
                    ParsePosition parsePosition2 = this.pos;
                    parsePosition2.setIndex(parsePosition2.getIndex() - 1);
                    throw new java.text.ParseException("Invalid month", this.pos.getIndex());
                case 70:
                    if (!skipPair('e', 'b') || (!z10 && skipAlternativePair('e', 'E', 'b', 'B'))) {
                        return 1;
                    }
                    ParsePosition parsePosition3 = this.pos;
                    parsePosition3.setIndex(parsePosition3.getIndex() - 1);
                    throw new java.text.ParseException("Invalid month", this.pos.getIndex());
                case 74:
                    if (!skipChar('u') || (!z10 && skipChar('U'))) {
                        if (skipChar('l')) {
                            return 6;
                        }
                        if (z10 && skipChar('L')) {
                            return 6;
                        }
                        if (skipChar('n')) {
                            return 5;
                        }
                        if (z10 && skipChar('N')) {
                            return 5;
                        }
                        ParsePosition parsePosition4 = this.pos;
                        parsePosition4.setIndex(parsePosition4.getIndex() - 1);
                    } else {
                        if (skipPair('a', 'n')) {
                            return 0;
                        }
                        if (!z10 && skipAlternativePair('a', 'A', 'n', 'N')) {
                            return 0;
                        }
                    }
                    ParsePosition parsePosition5 = this.pos;
                    parsePosition5.setIndex(parsePosition5.getIndex() - 1);
                    throw new java.text.ParseException("Invalid month", this.pos.getIndex());
                case 77:
                    if (skipChar('a') || (!z10 && skipChar('A'))) {
                        if (skipChar('r')) {
                            return 2;
                        }
                        if (z10 && skipChar('R')) {
                            return 2;
                        }
                        if (skipChar('y')) {
                            return 4;
                        }
                        if (z10 && skipChar('Y')) {
                            return 4;
                        }
                        ParsePosition parsePosition6 = this.pos;
                        parsePosition6.setIndex(parsePosition6.getIndex() - 1);
                    }
                    ParsePosition parsePosition7 = this.pos;
                    parsePosition7.setIndex(parsePosition7.getIndex() - 1);
                    throw new java.text.ParseException("Invalid month", this.pos.getIndex());
                case 78:
                    if (!skipPair('o', 'v')) {
                        return 10;
                    }
                    if (!z10 && skipAlternativePair('o', 'O', 'v', 'V')) {
                        return 10;
                    }
                    ParsePosition parsePosition8 = this.pos;
                    parsePosition8.setIndex(parsePosition8.getIndex() - 1);
                    throw new java.text.ParseException("Invalid month", this.pos.getIndex());
                case 79:
                    if (!skipPair('c', 't')) {
                        return 9;
                    }
                    if (!z10 && skipAlternativePair('c', 'C', 't', 'T')) {
                        return 9;
                    }
                    ParsePosition parsePosition9 = this.pos;
                    parsePosition9.setIndex(parsePosition9.getIndex() - 1);
                    throw new java.text.ParseException("Invalid month", this.pos.getIndex());
                case 83:
                    if (!skipPair('e', 'p')) {
                        return 8;
                    }
                    if (!z10 && skipAlternativePair('e', 'E', 'p', 'P')) {
                        return 8;
                    }
                    ParsePosition parsePosition10 = this.pos;
                    parsePosition10.setIndex(parsePosition10.getIndex() - 1);
                    throw new java.text.ParseException("Invalid month", this.pos.getIndex());
                case 97:
                    if (!z10) {
                        if (!skipPair('u', 'g')) {
                            return 7;
                        }
                        if (z10) {
                        }
                        if (!skipPair('p', 'r')) {
                            return 3;
                        }
                        if (!z10) {
                            return 3;
                        }
                        break;
                    }
                    ParsePosition parsePosition11 = this.pos;
                    parsePosition11.setIndex(parsePosition11.getIndex() - 1);
                    throw new java.text.ParseException("Invalid month", this.pos.getIndex());
                case 100:
                    if (!z10) {
                        if (!skipPair('e', 'c')) {
                            return 11;
                        }
                        if (!z10) {
                            return 11;
                        }
                    }
                    ParsePosition parsePosition12 = this.pos;
                    parsePosition12.setIndex(parsePosition12.getIndex() - 1);
                    throw new java.text.ParseException("Invalid month", this.pos.getIndex());
                case 102:
                    if (!z10) {
                        if (!skipPair('e', 'b')) {
                            break;
                        }
                        return 1;
                    }
                    ParsePosition parsePosition13 = this.pos;
                    parsePosition13.setIndex(parsePosition13.getIndex() - 1);
                    throw new java.text.ParseException("Invalid month", this.pos.getIndex());
                case 106:
                    if (!z10) {
                        if (skipChar('u')) {
                            if (skipChar('l')) {
                                return 6;
                            }
                            if (z10) {
                            }
                            if (skipChar('n')) {
                                return 5;
                            }
                            if (z10) {
                            }
                            ParsePosition parsePosition14 = this.pos;
                            parsePosition14.setIndex(parsePosition14.getIndex() - 1);
                        } else {
                            if (skipChar('l')) {
                                return 6;
                            }
                            if (z10) {
                            }
                            if (skipChar('n')) {
                                return 5;
                            }
                            if (z10) {
                            }
                            ParsePosition parsePosition15 = this.pos;
                            parsePosition15.setIndex(parsePosition15.getIndex() - 1);
                        }
                        break;
                    }
                    ParsePosition parsePosition16 = this.pos;
                    parsePosition16.setIndex(parsePosition16.getIndex() - 1);
                    throw new java.text.ParseException("Invalid month", this.pos.getIndex());
                case 109:
                    if (!z10) {
                        if (skipChar('a')) {
                            if (skipChar('r')) {
                                return 2;
                            }
                            if (z10) {
                            }
                            if (skipChar('y')) {
                                return 4;
                            }
                            if (z10) {
                            }
                            ParsePosition parsePosition17 = this.pos;
                            parsePosition17.setIndex(parsePosition17.getIndex() - 1);
                        } else {
                            if (skipChar('r')) {
                                return 2;
                            }
                            if (z10) {
                            }
                            if (skipChar('y')) {
                                return 4;
                            }
                            if (z10) {
                            }
                            ParsePosition parsePosition18 = this.pos;
                            parsePosition18.setIndex(parsePosition18.getIndex() - 1);
                        }
                        break;
                    }
                    ParsePosition parsePosition19 = this.pos;
                    parsePosition19.setIndex(parsePosition19.getIndex() - 1);
                    throw new java.text.ParseException("Invalid month", this.pos.getIndex());
                case 110:
                    if (!z10) {
                        if (!skipPair('o', 'v')) {
                            return 10;
                        }
                        if (!z10) {
                            return 10;
                        }
                    }
                    ParsePosition parsePosition110 = this.pos;
                    parsePosition110.setIndex(parsePosition110.getIndex() - 1);
                    throw new java.text.ParseException("Invalid month", this.pos.getIndex());
                case 111:
                    if (!z10) {
                        if (!skipPair('c', 't')) {
                            return 9;
                        }
                        if (!z10) {
                            return 9;
                        }
                    }
                    ParsePosition parsePosition111 = this.pos;
                    parsePosition111.setIndex(parsePosition111.getIndex() - 1);
                    throw new java.text.ParseException("Invalid month", this.pos.getIndex());
                case 115:
                    if (!z10) {
                        if (!skipPair('e', 'p')) {
                            return 8;
                        }
                        if (!z10) {
                            return 8;
                        }
                    }
                    ParsePosition parsePosition112 = this.pos;
                    parsePosition112.setIndex(parsePosition112.getIndex() - 1);
                    throw new java.text.ParseException("Invalid month", this.pos.getIndex());
                default:
                    ParsePosition parsePosition113 = this.pos;
                    parsePosition113.setIndex(parsePosition113.getIndex() - 1);
                    throw new java.text.ParseException("Invalid month", this.pos.getIndex());
            }
        }

        public final int parseZoneOffset() throws java.text.ParseException {
            int i10 = getChar();
            if (i10 != 43 && i10 != 45) {
                if (i10 != -1) {
                    ParsePosition parsePosition = this.pos;
                    parsePosition.setIndex(parsePosition.getIndex() - 1);
                }
                throw new java.text.ParseException("Invalid zone", this.pos.getIndex());
            }
            int asciiDigits = parseAsciiDigits(4, 4, true);
            if (isValidZoneOffset(asciiDigits)) {
                return ((asciiDigits % 100) + ((asciiDigits / 100) * 60)) * (i10 != 43 ? 1 : -1);
            }
            ParsePosition parsePosition2 = this.pos;
            parsePosition2.setIndex(parsePosition2.getIndex() - 5);
            throw new java.text.ParseException("Invalid zone", this.pos.getIndex());
        }

        public final boolean peekAsciiDigit() {
            return this.pos.getIndex() < this.text.length() && '0' <= this.text.charAt(this.pos.getIndex()) && this.text.charAt(this.pos.getIndex()) <= '9';
        }

        public final boolean peekChar(char c10) {
            return this.pos.getIndex() < this.text.length() && this.text.charAt(this.pos.getIndex()) == c10;
        }

        public boolean peekFoldingWhiteSpace() {
            if (this.pos.getIndex() < this.text.length()) {
                return this.text.charAt(this.pos.getIndex()) == ' ' || this.text.charAt(this.pos.getIndex()) == '\t' || this.text.charAt(this.pos.getIndex()) == '\r';
            }
            return false;
        }

        public final boolean skipAlternative(char c10, char c11) {
            return skipChar(c10) || skipChar(c11);
        }

        public final boolean skipAlternativePair(char c10, char c11, char c12, char c13) {
            if (!skipAlternative(c10, c11)) {
                return false;
            }
            if (skipAlternative(c12, c13)) {
                return true;
            }
            ParsePosition parsePosition = this.pos;
            parsePosition.setIndex(parsePosition.getIndex() - 1);
            return false;
        }

        public final boolean skipAlternativeTriple(char c10, char c11, char c12, char c13, char c14, char c15) {
            if (!skipAlternativePair(c10, c11, c12, c13)) {
                return false;
            }
            if (skipAlternative(c14, c15)) {
                return true;
            }
            ParsePosition parsePosition = this.pos;
            parsePosition.setIndex(parsePosition.getIndex() - 2);
            return false;
        }

        public final boolean skipChar(char c10) {
            if (this.pos.getIndex() >= this.text.length() || this.text.charAt(this.pos.getIndex()) != c10) {
                return false;
            }
            ParsePosition parsePosition = this.pos;
            parsePosition.setIndex(parsePosition.getIndex() + 1);
            return true;
        }

        public boolean skipFoldingWhiteSpace() {
            if (skipChar(' ')) {
                if (!peekFoldingWhiteSpace()) {
                    return true;
                }
                ParsePosition parsePosition = this.pos;
                parsePosition.setIndex(parsePosition.getIndex() - 1);
            } else if (!peekFoldingWhiteSpace()) {
                return false;
            }
            int index = this.pos.getIndex();
            if (skipWhiteSpace()) {
                while (skipNewline()) {
                    if (!skipWhiteSpace()) {
                        this.pos.setIndex(index);
                        return false;
                    }
                }
                return true;
            }
            if (skipNewline() && skipWhiteSpace()) {
                return true;
            }
            this.pos.setIndex(index);
            return false;
        }

        public final boolean skipNewline() {
            return skipPair('\r', '\n');
        }

        public final boolean skipPair(char c10, char c11) {
            if (!skipChar(c10)) {
                return false;
            }
            if (skipChar(c11)) {
                return true;
            }
            ParsePosition parsePosition = this.pos;
            parsePosition.setIndex(parsePosition.getIndex() - 1);
            return false;
        }

        public final boolean skipWhiteSpace() {
            int index = this.pos.getIndex();
            while (skipAlternative(' ', '\t')) {
            }
            return this.pos.getIndex() > index;
        }

        public abstract Date tryParse();

        public final int parseAsciiDigits(int i10, int i11) {
            return parseAsciiDigits(i10, i11, false);
        }

        public final int parseAsciiDigits(int i10, int i11, boolean z10) throws java.text.ParseException {
            String strM7416a;
            int i12 = 0;
            int asciiDigit = 0;
            while (i12 < i11 && peekAsciiDigit()) {
                asciiDigit = (asciiDigit * 10) + getAsciiDigit();
                i12++;
            }
            if (i12 >= i10 && (i12 != i11 || z10 || !peekAsciiDigit())) {
                return asciiDigit;
            }
            ParsePosition parsePosition = this.pos;
            parsePosition.setIndex(parsePosition.getIndex() - i12);
            if (i10 == i11) {
                strM7416a = Integer.toString(i10);
            } else {
                strM7416a = C6619b.m7416a(i10, i11, "between ", " and ");
            }
            throw new java.text.ParseException(C0941K.m1458b("Invalid input: expected ", strM7416a, " ASCII digits"), this.pos.getIndex());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public class Rfc2822LenientParser extends Rfc2822StrictParser {
        private Boolean hasDefaultFws;

        public Rfc2822LenientParser(String str, ParsePosition parsePosition) {
            super(str, parsePosition);
        }

        @Override // javax.mail.internet.MailDateFormat.Rfc2822StrictParser
        public boolean isMonthNameCaseSensitive() {
            return false;
        }

        @Override // javax.mail.internet.MailDateFormat.AbstractDateParser
        public boolean isValidZoneOffset(int i10) {
            return true;
        }

        @Override // javax.mail.internet.MailDateFormat.Rfc2822StrictParser
        public int parseDay() {
            skipFoldingWhiteSpace();
            return parseAsciiDigits(1, 3);
        }

        @Override // javax.mail.internet.MailDateFormat.Rfc2822StrictParser
        public void parseFwsBetweenTimeOfDayAndZone() {
            skipFoldingWhiteSpace();
        }

        @Override // javax.mail.internet.MailDateFormat.Rfc2822StrictParser
        public void parseFwsInMonth() throws java.text.ParseException {
            Boolean bool = this.hasDefaultFws;
            if (bool == null) {
                this.hasDefaultFws = Boolean.valueOf(!skipChar('-'));
                skipFoldingWhiteSpace();
            } else if (bool.booleanValue()) {
                skipFoldingWhiteSpace();
            } else {
                parseChar('-');
            }
        }

        @Override // javax.mail.internet.MailDateFormat.Rfc2822StrictParser
        public int parseHour() {
            return parseAsciiDigits(1, 2);
        }

        @Override // javax.mail.internet.MailDateFormat.Rfc2822StrictParser
        public int parseMinute() {
            return parseAsciiDigits(1, 2);
        }

        @Override // javax.mail.internet.MailDateFormat.Rfc2822StrictParser
        public int parseOptionalBegin() {
            while (this.pos.getIndex() < this.text.length() && !peekAsciiDigit()) {
                ParsePosition parsePosition = this.pos;
                parsePosition.setIndex(parsePosition.getIndex() + 1);
            }
            return -1;
        }

        @Override // javax.mail.internet.MailDateFormat.Rfc2822StrictParser
        public int parseSecond() {
            return parseAsciiDigits(1, 2);
        }

        @Override // javax.mail.internet.MailDateFormat.Rfc2822StrictParser
        public int parseYear() {
            int asciiDigits = parseAsciiDigits(1, 8);
            if (asciiDigits >= 1000) {
                return asciiDigits;
            }
            return asciiDigits >= 50 ? asciiDigits + 1900 : asciiDigits + 2000;
        }

        @Override // javax.mail.internet.MailDateFormat.Rfc2822StrictParser
        public int parseZone() {
            int i10;
            try {
                try {
                    if (this.pos.getIndex() >= this.text.length()) {
                        throw new java.text.ParseException("Missing zone", this.pos.getIndex());
                    }
                    if (peekChar('+') || peekChar('-')) {
                        return parseZoneOffset();
                    }
                    if (skipAlternativePair('U', 'u', 'T', 't') || skipAlternativeTriple('G', 'g', 'M', 'm', 'T', 't')) {
                        return 0;
                    }
                    if (skipAlternative('E', 'e')) {
                        i10 = 4;
                    } else if (skipAlternative('C', 'c')) {
                        i10 = 5;
                    } else if (skipAlternative('M', 'm')) {
                        i10 = 6;
                    } else {
                        if (!skipAlternative('P', 'p')) {
                            throw new java.text.ParseException("Invalid zone", this.pos.getIndex());
                        }
                        i10 = 7;
                    }
                    if (skipAlternativePair('S', 's', 'T', 't')) {
                        i10++;
                    } else if (!skipAlternativePair('D', 'd', 'T', 't')) {
                        ParsePosition parsePosition = this.pos;
                        parsePosition.setIndex(parsePosition.getIndex() - 1);
                        throw new java.text.ParseException("Invalid zone", this.pos.getIndex());
                    }
                    return i10 * 60;
                } catch (java.text.ParseException e10) {
                    e = e10;
                }
            } catch (java.text.ParseException e11) {
                e = e11;
            }
            MailLogger mailLogger = MailDateFormat.LOGGER;
            Level level = Level.FINE;
            if (mailLogger.isLoggable(level)) {
                MailDateFormat.LOGGER.log(level, C6989a.m7848b(this.text, "'", new StringBuilder("No timezone? : '")), (Throwable) e);
            }
            return 0;
        }

        @Override // javax.mail.internet.MailDateFormat.AbstractDateParser
        public boolean peekFoldingWhiteSpace() {
            if (super.peekFoldingWhiteSpace()) {
                return true;
            }
            return this.pos.getIndex() < this.text.length() && this.text.charAt(this.pos.getIndex()) == '\n';
        }

        @Override // javax.mail.internet.MailDateFormat.AbstractDateParser
        public boolean skipFoldingWhiteSpace() {
            char cCharAt;
            boolean zPeekFoldingWhiteSpace = peekFoldingWhiteSpace();
            while (this.pos.getIndex() < this.text.length() && ((cCharAt = this.text.charAt(this.pos.getIndex())) == '\t' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ')) {
                ParsePosition parsePosition = this.pos;
                parsePosition.setIndex(parsePosition.getIndex() + 1);
            }
            return zPeekFoldingWhiteSpace;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1f200e1347f0336e47a13bddf0692fda05e585487837480be1935e5057d3444b */
    public class Rfc2822StrictParser extends AbstractDateParser {
        public Rfc2822StrictParser(String str, ParsePosition parsePosition) {
            super(str, parsePosition);
        }

        public boolean isMonthNameCaseSensitive() {
            return true;
        }

        public int parseDay() {
            skipFoldingWhiteSpace();
            return parseAsciiDigits(1, 2);
        }

        public void parseFwsBetweenTimeOfDayAndZone() throws java.text.ParseException {
            parseFoldingWhiteSpace();
        }

        public void parseFwsInMonth() throws java.text.ParseException {
            parseFoldingWhiteSpace();
        }

        public int parseHour() {
            return parseAsciiDigits(2);
        }

        public int parseMinute() {
            return parseAsciiDigits(2);
        }

        public int parseMonth() throws java.text.ParseException {
            parseFwsInMonth();
            int monthName = parseMonthName(isMonthNameCaseSensitive());
            parseFwsInMonth();
            return monthName;
        }

        public int parseOptionalBegin() throws java.text.ParseException {
            if (peekAsciiDigit()) {
                return -1;
            }
            skipFoldingWhiteSpace();
            int dayName = parseDayName();
            parseChar(',');
            return dayName;
        }

        public int parseSecond() {
            return parseAsciiDigits(2);
        }

        public int parseYear() throws java.text.ParseException {
            int asciiDigits = parseAsciiDigits(4, 8);
            if (asciiDigits >= 1900) {
                return asciiDigits;
            }
            ParsePosition parsePosition = this.pos;
            parsePosition.setIndex(parsePosition.getIndex() - 4);
            while (this.text.charAt(this.pos.getIndex() - 1) == '0') {
                ParsePosition parsePosition2 = this.pos;
                parsePosition2.setIndex(parsePosition2.getIndex() - 1);
            }
            throw new java.text.ParseException("Invalid year", this.pos.getIndex());
        }

        public int parseZone() {
            return parseZoneOffset();
        }

        @Override // javax.mail.internet.MailDateFormat.AbstractDateParser
        public Date tryParse() throws java.text.ParseException {
            int optionalBegin = parseOptionalBegin();
            int day = parseDay();
            int month = parseMonth();
            int year = parseYear();
            parseFoldingWhiteSpace();
            int hour = parseHour();
            parseChar(':');
            int minute = parseMinute();
            int second = skipChar(':') ? parseSecond() : 0;
            parseFwsBetweenTimeOfDayAndZone();
            try {
                return MailDateFormat.this.toDate(optionalBegin, day, month, year, hour, minute, second, parseZone());
            } catch (IllegalArgumentException unused) {
                throw new java.text.ParseException("Invalid input: some of the calendar fields have invalid values, or day-name is inconsistent with date", this.pos.getIndex());
            }
        }
    }

    public MailDateFormat() {
        super(PATTERN, Locale.US);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        super.applyPattern(PATTERN);
    }

    private void superApplyPattern(String str) {
        super.applyPattern(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Date toDate(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18 = i16 == 60 ? 59 : i16;
        TimeZone timeZone = ((SimpleDateFormat) this).calendar.getTimeZone();
        try {
            ((SimpleDateFormat) this).calendar.setTimeZone(UTC);
            ((SimpleDateFormat) this).calendar.clear();
            ((SimpleDateFormat) this).calendar.set(i13, i12, i11, i14, i15, i18);
            if (i10 != -1 && i10 != ((SimpleDateFormat) this).calendar.get(7)) {
                throw new IllegalArgumentException("Inconsistent day-name");
            }
            ((SimpleDateFormat) this).calendar.add(12, i17);
            Date time = ((SimpleDateFormat) this).calendar.getTime();
            ((SimpleDateFormat) this).calendar.setTimeZone(timeZone);
            return time;
        } catch (Throwable th) {
            ((SimpleDateFormat) this).calendar.setTimeZone(timeZone);
            throw th;
        }
    }

    private Object writeReplace() {
        MailDateFormat mailDateFormat = new MailDateFormat();
        mailDateFormat.superApplyPattern("EEE, d MMM yyyy HH:mm:ss 'XXXXX' (z)");
        mailDateFormat.setTimeZone(getTimeZone());
        return mailDateFormat;
    }

    @Override // java.text.SimpleDateFormat
    public void applyLocalizedPattern(String str) {
        throw new UnsupportedOperationException("Method applyLocalizedPattern() shouldn't be called");
    }

    @Override // java.text.SimpleDateFormat
    public void applyPattern(String str) {
        throw new UnsupportedOperationException("Method applyPattern() shouldn't be called");
    }

    @Override // java.text.SimpleDateFormat, java.text.DateFormat
    public StringBuffer format(Date date, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        return super.format(date, stringBuffer, fieldPosition);
    }

    @Override // java.text.SimpleDateFormat
    public Date get2DigitYearStart() {
        throw new UnsupportedOperationException("Method get2DigitYearStart() shouldn't be called");
    }

    @Override // java.text.SimpleDateFormat, java.text.DateFormat
    public Date parse(String str, ParsePosition parsePosition) {
        if (str == null || parsePosition == null) {
            throw null;
        }
        if (parsePosition.getIndex() < 0 || parsePosition.getIndex() >= str.length()) {
            return null;
        }
        return isLenient() ? new Rfc2822LenientParser(str, parsePosition).parse() : new Rfc2822StrictParser(str, parsePosition).parse();
    }

    @Override // java.text.SimpleDateFormat
    public void set2DigitYearStart(Date date) {
        throw new UnsupportedOperationException("Method set2DigitYearStart() shouldn't be called");
    }

    @Override // java.text.DateFormat
    public void setCalendar(Calendar calendar) {
        throw new UnsupportedOperationException("Method setCalendar() shouldn't be called");
    }

    @Override // java.text.SimpleDateFormat
    public void setDateFormatSymbols(DateFormatSymbols dateFormatSymbols) {
        throw new UnsupportedOperationException("Method setDateFormatSymbols() shouldn't be called");
    }

    @Override // java.text.DateFormat
    public void setNumberFormat(NumberFormat numberFormat) {
        throw new UnsupportedOperationException("Method setNumberFormat() shouldn't be called");
    }

    @Override // java.text.SimpleDateFormat, java.text.DateFormat, java.text.Format
    public MailDateFormat clone() {
        return (MailDateFormat) super.clone();
    }
}
