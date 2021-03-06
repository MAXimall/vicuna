package cuploader;

import java.io.File;
import javax.swing.filechooser.FileFilter;

public class FileFilters {
    public static AllFilter all= new AllFilter();
    
    public static XMLFilter session = new XMLFilter();
    public static ImgFilter images = new ImgFilter();
    public static DocsFilter documents = new DocsFilter();
    public static TxtFilter text = new TxtFilter();
    public static OggFilter multimedia = new OggFilter();

    public static class AllFilter extends FileFilter {
        @Override
        public boolean accept(File f) {
            if (f.isDirectory())
                return true;
            String s = f.getName();
            int i = s.lastIndexOf('.');

            if (i > 0 && i < s.length() - 1) {
                s = s.substring(i + 1).toLowerCase();
                if (s.equals("jpg") || s.equals("png") || s.equals("svg") ||s.equals("gif") || s.equals("pdf") || s.equals("djvu") || s.equals("ogg") || s.equals("ogv"))
                    return true;
            }
            return false;
        }

        @Override
        public String getDescription() {
            return Data.text("loading-filter-all");
        }
    }
    
    public static class XMLFilter extends FileFilter {
        @Override
        public boolean accept(File f) {
            if (f.isDirectory())
                return true;
            String s = f.getName();
            int i = s.lastIndexOf('.');

            if (i > 0 && i < s.length() - 1)
                if (s.substring(i + 1).toLowerCase().equals("xml"))
                    return true;
            return false;
        }

        @Override
        public String getDescription() {
            return Data.text("session-file") + " (*.xml)";
        }
    }

    public static class OggFilter extends FileFilter {
        @Override
        public boolean accept(File f) {
            if (f.isDirectory())
                return true;
            String s = f.getName();
            int i = s.lastIndexOf('.');

            if (i > 0 && i < s.length() - 1) {
                s = s.substring(i + 1).toLowerCase();
                if (s.equals("ogg") || s.equals("ogv"))
                    return true;
            }
            return false;
        }

        @Override
        public String getDescription() {
            return Data.text("loading-filter-media") + " (*.ogg, *.ogv)";
        }
    }
    
    public static class ImgFilter extends FileFilter {
        @Override
        public boolean accept(File f) {
            if (f.isDirectory())
                return true;
            String s = f.getName();
            int i = s.lastIndexOf('.');

            if (i > 0 && i < s.length() - 1) {
                s = s.substring(i + 1).toLowerCase();
                if (s.equals("jpg") || s.equals("png") || s.equals("gif"))
                    return true;
            }
            return false;
        }

        @Override
        public String getDescription() {
            return Data.text("loading-filter-img") + " (*.jpg, *.png, *.gif)";
        }
    }

    public static class DocsFilter extends FileFilter {
        @Override
        public boolean accept(File f) {
            if (f.isDirectory())
                return true;
            String s = f.getName();
            int i = s.lastIndexOf('.');

            if (i > 0 && i < s.length() - 1) {
                s = s.substring(i + 1).toLowerCase();
                if (s.equals("jpg") || s.equals("pdf") || s.equals("djvu"))
                    return true;
            }
            return false;
        }

        @Override
        public String getDescription() {
            return Data.text("loading-filter-scan") + " (*.jpg, *.pdf, *.djvu)";
        }
    }

    public static class TxtFilter extends FileFilter {
        @Override
        public boolean accept(File f) {
            if (f.isDirectory())
                return true;
            String s = f.getName();
            int i = s.lastIndexOf('.');

            if (i > 0 && i < s.length() - 1)
                if (s.substring(i + 1).toLowerCase().equals("txt"))
                    return true;
            return false;
        }

        @Override
        public String getDescription() {
            return Data.text("settings-program-descfile-file") + " (*.txt)";
        }
    }
}
