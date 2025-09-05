import pandas as pd

data={
    "Username": ["admin","Charles","Deku"],
    "Passwords": ["Password","Charl12","Dek11"]
}

#convert data into dataframe
df=pd.DataFrame(data)

df.to_csv("./sample.csv",index=False)

input_data=pd.read_csv("./sample.csv")
print(input_data)