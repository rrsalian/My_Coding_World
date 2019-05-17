class LoginPage():
    def __init__(self,chrome):
        self.chrome=chrome

        self.email_text_box="email"
        self.psw_text_box="pass"
        self.login_button="send2"

    def type_email_text_box(self,email):
        self.chrome.find_element_by_id(id_=self.email_text_box).send_keys(email)

    def type_psw_text_box(self,psw):
        self.chrome.find_element_by_id(id_=self.psw_text_box).send_keys(psw)

    def click_login_button(self):
        self.chrome.find_element_by_id(id_=self.login_button).click()