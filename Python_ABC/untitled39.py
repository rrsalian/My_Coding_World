import matplotlib.pyplot as plt
from wordcloud import WordCloud
text="Python is an interpreted high-level programming..."

def cloud(text):
    word=WordCloud(stopwords={'to','of','as','.',',','a'}
    ).generate(text)
    plt.imshow(word)
    plt.show()
cloud(text)