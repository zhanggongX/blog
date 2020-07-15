package patterns.create.create5_builder_patterns;


import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 房子类
 * <p>
 * @author: 张弓
 * @date: 2018/8/22
 * @version: 1.0.0
 */
public class House {

    List<String> houseParts = new ArrayList<>();

    public void addParts(String part){
        houseParts.add(part);
    }

    public void showHouse(){
        if(!CollectionUtils.isEmpty(houseParts)){
            for(String part : houseParts){
                System.out.println(part);
            }
        }
    }
}
