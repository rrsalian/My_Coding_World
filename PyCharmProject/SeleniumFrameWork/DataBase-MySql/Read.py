import mysql.connector

try:
    print("connection to database")
    connection=mysql.connector.connect(host='localhost',database='cricket',user='root',password='root')
    print("connected to databse")
    print("****************")
    cursor=connection.cursor()

    sql_insert_query=""" select * from cricketers """
    cursor.execute(sql_insert_query)

    result_data=cursor.fetchall()
    print("Records of the table :")
    print("cid","cname","country")
    for row in result_data:
        print(row[0],row[1],row[2])
    print("Rows completely fetched")


except Exception as e:
    print("Exception occured",e)


finally:
    if connection.is_connected():
        cursor.close()
        connection.close()
        print("connection is closed")
