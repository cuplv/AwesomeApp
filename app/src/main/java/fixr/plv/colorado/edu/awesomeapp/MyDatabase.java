package fixr.plv.colorado.edu.awesomeapp;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;


public class MyDatabase {

  public void doQuery(SQLiteDatabase db,
                      String[] columns) {

    Cursor cursor = db.query("mytable", columns, null, null,
        null, null, null);

    while (cursor.moveToNext()) {
      // get stuff from the cursor
    }
      // @smover: You should eventually call close on the cursor,
      //  I saw more than 3000 people calling close() after calling db.query()
      cursor.close();
    }

}
