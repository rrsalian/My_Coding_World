import mysql.connector

try:
    print("connection to database")
    connection=mysql.connector.connect(host='localhost',database='cricket',user='root',password='root')
    print("Connected to Database")

    cursor=connection.cursor()

    sql_select_query=""" select * from cricketers """
    cursor.execute(sql_select_query)
    result_data=cursor.fetchall()
    print("cid", "cname", "country")
    for row in result_data:
        print(row[0], row[1], row[2])

    print("\n\n")

    sql_delet_query=""" DELETE FROM `cricketers` WHERE (`cid` = '14'); """

    cursor.execute(sql_delet_query)
    print("******************************")
    connection.commit()

    sql_select_query = """ select * from cricketers """
    cursor.execute(sql_select_query)
    result_data = cursor.fetchall()
    print("cid", "cname", "country")
    for row in result_data:
        print(row[0], row[1], row[2])

except Exception as e:
    print("Exception occured",e)   


finally:
    if connection.is_connected():
        cursor.close()
        connection.close()
        print("connection is closed")
