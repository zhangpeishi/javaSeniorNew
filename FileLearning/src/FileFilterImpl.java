
import java.io.File;
import java.io.FileFilter;


public class FileFilterImpl implements FileFilter{
    @Override
    public boolean accept(File pathname) {
        /**
         * 如果pathname 是文件夹 返回true 继续遍历文件夹
         * 如果是文件
         */
        if(pathname.isDirectory()){
            return true;
        }
        return pathname.getName().toLowerCase().endsWith(".java");

    }
}
