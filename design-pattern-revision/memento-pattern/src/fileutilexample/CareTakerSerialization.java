package fileutilexample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//this class also can be unique for different implemetations
//we could be using serialization
public class CareTakerSerialization implements ICareTaker{

	//serialzation file
	private static final String fileName = "state.ser";
	
	@Override
	public void save(Undoable undoable) {
		try(ObjectOutputStream os = new ObjectOutputStream(
				new FileOutputStream(new File(fileName))
				)){
				Object memento = undoable.saveState();
				os.writeObject(memento);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void undo(Undoable undoable) {
		try(ObjectInputStream is = new ObjectInputStream(
				new FileInputStream(new File(fileName))
				)){
			Object memento = is.readObject();
			undoable.undoState(memento);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
