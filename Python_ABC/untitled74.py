s="QWERTYUIOPas @# DFG@#$%^DCVBHJI)(*YTRDFGHJKOYTFCVBUYWSDRESDFGMKIUdfghj klzxcvbnm12345678QWERTYUI"

if len("".join(set([i.lower() for i in s if i.isalpha()])))==26:
    print("panagram")
else:
    print("not panagram")