try:
    f=open("demo.txt",encoding='utf-8')
    #perform operation on to the file
finally:
    f.close()