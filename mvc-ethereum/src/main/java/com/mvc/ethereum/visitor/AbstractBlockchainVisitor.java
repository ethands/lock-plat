package com.mvc.ethereum.visitor;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mvc.ethereum.model.Account;
import com.mvc.ethereum.model.Method;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public abstract class AbstractBlockchainVisitor<T> {

    public AbstractBlockchainVisitor(Method createMethod) {
        this.createMethod = createMethod;
    }

    @Getter
    @Setter
    private Method method;

    @Getter
    private Method createMethod;

    @Setter
    @Getter
    private Account account;

    @Getter
    @Setter
    private String address;

    @Setter
    @Getter
    private T model;

    public abstract String getContent();

    public abstract String getName();

    public Object[] getCreateArgs() {
        return createMethod.getArgs();
    }

}
