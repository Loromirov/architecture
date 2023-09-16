import java.util.ArrayList;
import java.util.List;

public class GeometryFigure {

    static private List<IShape> toolbox;
    

    public GeometryFigure(){
        toolbox = new ArrayList<IShape>();
    }
    //Метод для удаления фигуры
    public void remove(int num){
        toolbox.remove(num);
    }
    // Метод для добавления фигуры
    public void add(IShape figure){
        toolbox.add(figure);
    }
    // Метод поиска необходимой фигуры
    public void search(IShape fIgure){
        int index = toolbox.indexOf(fIgure);
        if (index >= 0) {
            System.out.printf("Данная фигура под индексом %d.", index);
        }
        else{
            System.out.printf("Фигуры нет в списке.");
        }
    }
    // Метод отображения подробной информации о фигуре
    public void getInfo(int num){
        if (num <= toolbox.size() - 1) {
            IShape figure = toolbox.get(num);
            System.out.printf("Площадь равна %.2f\n", figure.getArea());
            System.out.printf("Периметр равен %.2f\n", figure.getPerimeter());
        }
        else{
            System.out.printf("Фигуры нет в списке.");
        }
    }

}
