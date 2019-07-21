import instaloader

L = instaloader.Instaloader()
L.login('user_id', 'password') 
profile = instaloader.Profile.from_username(L.context, "rr_salian")
follow_list = []
for followee in profile.get_followees():
	follow_list.append(followee.username)
	print(followee.username)
	

 

	


	
