package org.jboss.quickstarts.brms;

/**
 * This class was automatically generated by the data modeler tool.
 */
public class Customer extends org.jboss.quickstarts.brms.Person implements java.io.Serializable {

static final long serialVersionUID = 1L;
    
    private org.jboss.quickstarts.brms.CustomerType customerType;

    public Customer() {
    }

    public Customer(org.jboss.quickstarts.brms.CustomerType customerType) {
        this.customerType = customerType;
    }


    
    public org.jboss.quickstarts.brms.CustomerType getCustomerType() {
        return this.customerType;
    }

    public void setCustomerType(  org.jboss.quickstarts.brms.CustomerType customerType ) {
        this.customerType = customerType;
    }
}