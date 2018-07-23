package i57Exception;

import javax.annotation.Resource;
import java.sql.SQLException;

public class ResourceLoader {
    public void loadResource(String resourceName) throws ResourceLoadException {
        Resource r;
//        try {
//            r = loadResourceFromDB(resourceName);
//        } catch (SQLException e) {
//            throw new ResourceLoadException("SQL Exception loading resource "
//                    + "resourceName:" + e.toString());
//        }
    }
}
