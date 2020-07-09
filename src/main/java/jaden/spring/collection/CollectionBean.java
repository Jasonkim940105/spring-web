package jaden.spring.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionBean {
    private Map<String, String> addressList;
    private Properties addressProps;
    private Set<String> addressSet;

    public Set<String> getAddressSet() {
        return addressSet;
    }

    public void setAddressSet(Set<String> addressSet) {
        this.addressSet = addressSet;
    }

    public Properties getAddressProps() {
        return addressProps;
    }

    public void setAddressProps(Properties addressProps) {
        this.addressProps = addressProps;
    }

    public Map<String, String> getAddressList() {
        return addressList;
    }

    public void setAddressList(Map<String, String> addressList) {
        this.addressList = addressList;
    }
}
