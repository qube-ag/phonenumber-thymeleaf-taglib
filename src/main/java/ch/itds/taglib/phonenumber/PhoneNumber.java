package ch.itds.taglib.phonenumber;

import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber;

public class PhoneNumber {

    private final transient PhoneNumberUtil phoneUtil;

    public PhoneNumber() {
        phoneUtil = PhoneNumberUtil.getInstance();
    }

    public String format(String number, String defaultRegion, String format) {
        return format(number, defaultRegion, PhoneNumberUtil.PhoneNumberFormat.valueOf(format));
    }

    public String format(String number, String defaultRegion, PhoneNumberUtil.PhoneNumberFormat format) {

        Phonenumber.PhoneNumber phoneNumber;
        try {
            phoneNumber = phoneUtil.parse(number, defaultRegion);
        } catch (NumberParseException e) {
            return number;
        }
        return phoneUtil.format(phoneNumber, format);
    }


}
