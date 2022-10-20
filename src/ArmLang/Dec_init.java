package ArmLang;

import static java.lang.Byte.parseByte;
import static java.lang.Double.parseDouble;

public class Dec_init {
    public void dec_init(String decInitString) {
        String[] splitedDecInitString = decInitString.split("\\s+");
        switch (splitedDecInitString[0]) {
            case "ամբ1" :
                byte var1 = parseByte(splitedDecInitString[3]);
                break;
            case "ստ8" :
                double var2 = parseDouble(splitedDecInitString[3]);
                break;
        }
    }
}
