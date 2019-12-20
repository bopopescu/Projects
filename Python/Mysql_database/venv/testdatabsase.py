import mysql.connector
def myconn():
    mydb=mysql.connector.connect(host='localhost',database='mysql',user='root',password='21826041')
    print(mydb)
    mycursor = mydb.cursor()#create instance of cursor class to execute SQL statement
    #mycursor.execute("CREATE DATABASE myschool")"create a database
    mycursor.execute("SHOW DATABASES")
    for x in mycursor:
        print(x)
    mydb1=mysql.connector.connect(host='localhost',user='root',password='21826041',database='myschool')#connect to database
    #ajout d'un clé primaire
    mycursor.execute("DROP TABLE student")
    table=mycursor.execute("CREATE TABLE student (id INT(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,firstname VARCHAR(255), secondname VARCHAR(255))")
    #print(table)
    #table=mycursor.execute("CREATE TABLE customers (name VARCHAR(255), address VARCHAR(255))")
    mycursor.execute("SHOW TABLES")
    for x in mycursor:
        print(x)
    mycursor.execute("DESC student")
    print(mycursor.fetchall())
    mycursor.execute("ALTER TABLE student DROP id")
    mycursor.execute("DESC student")
    print(mycursor.fetchall())
    mycursor.execute( "ALTER TABLE student ADD column id INT(11) NOT NULL AUTO_INCREMENT PRIMARY KEY ")
    mycursor.execute("DESC student")
    print(mycursor.fetchall())
    #insert des données
    Query="INSERT INTO student(firstname,secondname) VALUES(%s,%s)"
    val=("maryem","jaballah")
    mycursor.execute(Query, val)
    mydb1.commit()
    print(mycursor.rowcount,"row inserted")
    query = "SELECT * FROM student"
    mycursor.execute(query)
    records = mycursor.fetchall()
    for record in records:
        print(record)
    Query="INSERT INTO student(firstname,secondname) VALUES(%s,%s)"
    val=[("alaa","Brahim"),("amal","ghazweni"),("syrine","daoud")]
    mycursor.executemany(Query,val)
    mydb1.commit()
    print(mycursor.rowcount," row inserted")
    query = "SELECT * FROM student"
    mycursor.execute(query)
    records=mycursor.fetchall()
    for record in records:
        print(record)
    Query="SELECT * FROM student WHERE id=2"
    mycursor.execute(Query)
    records=mycursor.fetchall()
    for record in records:
        print(record)
    query= "SELECT * FROM student ORDER BY  firstname DESC"
    mycursor.execute(query)
    records=mycursor.fetchall()
    for record in records:
        print(record)
    query="DELETE FROM student WHERE id=2"
    mycursor.execute(query)
    mydb1.commit()
    query="SELECT * FROM student"
    mycursor.execute(query)
    records=mycursor.fetchall()
    for record in records:
        print(record)
    query="DROP TABLE IF EXISTS user"
    mycursor.execute(query)
    query= "UPDATE student SET secondname=%s WHERE secondname=%s "
    val=("JABALLAH","jaballah")
    mycursor.execute(query,val)
    mydb1.commit()
    query="SELECT * FROM student "
    mycursor.execute(query)
    records=mycursor.fetchall()
    for record in records:
        print(record)


if __name__ == '__main__':
    myconn()

