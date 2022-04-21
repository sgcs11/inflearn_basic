package hello.hellospring.xml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "root")
public class xmlTest {

    private String result;

    public xmlTest(){

    }

    public xmlTest(String result) {
        super();
        this.result = result;
    }


    @XmlElement
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "xmlTest [result=" + result + "]";
    }
}
