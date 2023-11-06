package co.tiagoaguiar.tutorial.myfood;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

class PrdDb(
        context: Context
        ): SQLiteOpenHelper(context, name:"produtos.db", factory: null, varsion:1){
}

