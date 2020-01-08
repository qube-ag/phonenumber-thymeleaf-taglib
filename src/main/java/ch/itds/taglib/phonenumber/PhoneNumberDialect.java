package ch.itds.taglib.phonenumber;

import org.thymeleaf.dialect.AbstractDialect;
import org.thymeleaf.dialect.IExpressionObjectDialect;
import org.thymeleaf.expression.IExpressionObjectFactory;

public class PhoneNumberDialect extends AbstractDialect implements IExpressionObjectDialect {

    private final transient IExpressionObjectFactory PHONE_NUMBER_EXPRESSION_OBJECTS_FACTORY;

    public PhoneNumberDialect() {
        super("phoneNumber");
        PHONE_NUMBER_EXPRESSION_OBJECTS_FACTORY = new PhoneNumberExpressionFactory();
    }

    @Override
    public IExpressionObjectFactory getExpressionObjectFactory() {
        return PHONE_NUMBER_EXPRESSION_OBJECTS_FACTORY;
    }

}
