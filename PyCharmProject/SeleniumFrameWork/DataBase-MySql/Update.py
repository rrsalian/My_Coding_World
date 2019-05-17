import mysql.connector

try:
    print("connection to database")
    connection=mysql.connector.connect(host='localhost',database='cricket',user='root',password='root')
    print("Connected to Database")

    cursor=connection.cursor()

    sql_udate_query=""" update cricketers set cname="MSD" where cid=7 """

    cursor.execute(sql_udate_query)
    connection.commit()
    print("table is udated")

except Exception as e:
    print("Exception occured",e)


finally:
    if connection.is_connected():
        cursor.close()
        connection.close()
        print("connection is closed")
