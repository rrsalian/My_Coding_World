import mysql.connector

try:
    print("connection to database")
    connection=mysql.connector.connect(host='localhost',database='cricket',user='root',password='root')
    print("connected to databse")

    cursor=connection.cursor(prepared=None)



    row_insert=[(12,'Rahul','India'),(14,'VVS','India'),(38,'Watson','Austrlia')]

    sql_insert_query=""" insert into cricketers (cid,cname,country) value(%s,%s,%s) """

    cursor.executemany(sql_insert_query,row_insert)
    connection.commit()
    print("Number of Row inserted : ",cursor.rowcount)


except Exception as e:
    print("Exception occured",e)


finally:
    if connection.is_connected():
        cursor.close()
        connection.close()
        print("connection is closed")
