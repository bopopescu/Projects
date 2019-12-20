from PyQt5.QtWidgets import *
import sys
import mysql.connector

def on_button_clicked():
    alert = QMessageBox()
    if username.text() == "maryem" and password.text() == "21826041":
        alert.setText('logged successfully')
        alert.exec_()
        window.hide()
        window1.show()
    else :
        alert.setText('wrong username or password !!! Please enter a new login')
        alert.exec()
def myconn_to_database():
    mydb=mysql.connector.connect(host='localhost',database='mysql',user='root',password='21826041')
    print(mydb)
    mycursor = mydb.cursor()
    mycursor.execute("CREATE DATABASE IF NOT exists users")
    mycursor.execute("CREATE DATABASE IF NOT exists FilmMusicBookApplication" )
    mycursor.execute("SHOW DATABASES")
    for x in mycursor:
        print(x)
    database=mysql.connector.connect(host='localhost',database='FilmMusicBookApplication',user='root',password='21826041')

if __name__ == '__main__':
  # mydb = mysql.connector.connect(host='localhost', database='mysql', user='root', password='21826041')
   # mycursor = mydb.cursor()
 #   mydb1 = mysql.connector.connect(host='localhost', user='root', password='21826041', database='myschool')
    myconn_to_database()
    app = QApplication([])
    window = QWidget()
    layout = QVBoxLayout()
    layout.addWidget(QLabel("<font size=40>Favorite MusicFilmBook Application!my first GUI</front>"))
    layout.addWidget(QLabel('username'))
    username=QLineEdit()
    layout.addWidget(username)
    layout.addWidget(QLabel('password'))
    password=QLineEdit()
    layout.addWidget(password)
    window.setLayout(layout)
    button=QPushButton('login')
    layout.addWidget(button)
    button.clicked.connect(on_button_clicked)
    window.show()
    window1=QWidget()
    tab1=QTableWidget(10,5)
    layout=QHBoxLayout()
    layout.addWidget(tab1)
    tab1.setItem( 0 ,  0 , QTableWidgetItem ( "Item" ))
    tab1.setItem(0, 1, QTableWidgetItem("name"))
    tab1.setItem( 0 ,  2 , QTableWidgetItem ( "type" ))
    tab1.setItem(0, 3, QTableWidgetItem("Author"))
    tab1.setItem(0, 4, QTableWidgetItem("watch_nbre"))
    window1.setLayout(layout)
    sys.exit(app.exec_())

