
import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.Poligon;
import ModelElements.PoligonalModel;
import ModelElements.Scene;

public class ModelStore implements IModelChanger{
    public PoligonalModel models;
    public Scene scenes;
    public Flash flashes;
    public Camera cameras;
    private IModelChangeObserver changeObservers;
    
    public ModelStore(IModelChangeObserver changeObservers) {
        this.changeObservers = changeObservers;
        this.models = new PoligonalModel(new Poligon());
        this.cameras = new Camera();
        this.flashes = new Flash();
        this.scenes = new Scene(this.cameras, this.flashes, this.models);
    }
    public Scene getScene(int n){
        return this.scenes;
    }

    @Override 
    public void notifyChange(IModelChanger sender){

    }
}
