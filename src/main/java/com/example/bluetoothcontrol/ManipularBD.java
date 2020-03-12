package com.example.bluetoothcontrol;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.Update;
import android.content.Context;

import java.util.List;

@Database(entities = {ManipularBD.Person.class}, version = 1, exportSchema = false)
public abstract  class ManipularBD extends RoomDatabase {

    private static ManipularBD INSTANCE;

    public abstract PersonDao personDao();

    public static ManipularBD getAppDatabase(Context context) {
        if(INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(), ManipularBD.class, "ImpressoraDB")
                    //.fallbackToDestructiveMigration()
                    //.allowMainThreadQueries()
                    .build();
        }

        return INSTANCE;
    }

    public static void destroyInstance() {
        INSTANCE = null;
    }



    @Dao
    public interface PersonDao {

        @Insert
        long insert(Person person);

        @Insert
        void insertAll(List<Person> personList);

        @Update
        int update(Person person);

        @Delete
        void delete(Person person);

        @Query("SELECT * FROM person")
        List<Person> getAll();

        @Query("SELECT * FROM person WHERE id = :idperson")
        Person getById(int idperson);

    }






    @Entity
     public static class Person {

        @PrimaryKey(autoGenerate = true)
        private long id;
        @ColumnInfo(name = "first_name")
        private String firstName;
        @ColumnInfo(name = "last_name")
        private String lastName;
        private int age;
        private String email;

        public Person() {}

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }

}

