class HomePage():

    def __init__(self,chrome):
        self.chrome=chrome

        self.myacc_link="My Account"

    def click_myacc_link(self):
        self.chrome.find_element_by_link_text(self.myacc_link).click()
