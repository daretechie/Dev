import pandas as pd
import numpy as np

df = pd.read_csv('nigeria_SWtweet.csv') # i input the file name as d parameter
result = df.iloc[[-1]]
print(result) 
