import mysql.connector

try:
    print("connection to database")
    connection=mysql.connector.connect(host='localhost',database='cricket',user='root',password='root')
    print("connected to databse")

    cursor=connection.cursor()

    sql_insert_query=""" insert into cricketers (cid,cname,country) value(33,'Panth','India') """

    cursor.execute(sql_insert_query)
    connection.commit()
    print("Row inserted ")


except Exception as e:
    print("Exception occured",e)


finally:
    if connection.is_connected():
        cursor.close()
        connection.close()
        print("connection is closed")
