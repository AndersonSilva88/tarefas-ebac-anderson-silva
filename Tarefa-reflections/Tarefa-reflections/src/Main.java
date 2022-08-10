import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class cla = ClasseAnnotation.class;
       // System.out.println(cla);

        ClasseAnnotation classeAnnotation = new ClasseAnnotation();
        Class clss = classeAnnotation.getClass();
        //System.out.println(clss);

        Constructor cons = cla.getConstructor();
        ClasseAnnotation classeAn = (ClasseAnnotation) cons.newInstance();
        //System.out.println(cons);
        //System.out.println(classeAn);

        Field[] fields = classeAnnotation.getClass().getDeclaredFields();
        for (Field field : fields) {
            String nome = field.getName();
            System.out.println(nome);
        }
    }
}
