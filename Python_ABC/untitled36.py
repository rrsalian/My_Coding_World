#9886852828sk05

import pyqrcode as qr
#from pyqrcode import QRcode

s="www.fb.com"
url=qr.create(s)
url.svg("m.svg",scale=8)



