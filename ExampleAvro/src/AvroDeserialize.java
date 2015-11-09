
import java.io.File;
import java.io.IOException;
import org.apache.avro.file.DataFileReader;
import org.apache.avro.io.DatumReader;
import org.apache.avro.specific.SpecificDatumReader;

public class AvroDeserialize {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// Deserialize Users from disk
		DatumReader<User> userDatumReader = new SpecificDatumReader<User>();
		File file=new File("users.avro");
		DataFileReader<User> dataFileReader = new DataFileReader<User>(file, userDatumReader);
		User user = null;
		while (dataFileReader.hasNext()) {
		// Reuse user object by passing it to next(). This saves us from
		// allocating and garbage collecting many objects for files with
		// many items.
		user=(User)dataFileReader.next();
		System.out.println(dataFileReader.next());
		
		}
	}

}
