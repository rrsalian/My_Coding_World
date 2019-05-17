import mysql.connector

try:
    print("connection to database")
    connection=mysql.connector.connect(host='localhost',database='cricket',user='root',password='root')
    print("Connected to Database")

    cursor=connection.cursor()

    sql_select_query=""" select * from cricketers where cname='Dhoni' """

    cursor.execute(sql_select_query)

    result_data=cursor.fetchone()
    print(result_data)

except Exception as e:
    print("Exception occured",e)


finally:
    if connection.is_connected():
        cursor.close()
        connection.close()
        print("connection is closed")
