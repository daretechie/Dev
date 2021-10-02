df <- read.csv("C:/Users/DHREY/R_WorkSpace/Complete Machine Learning with R Studio - ML for 2020/data/House-Price.csv", header = T)

#Univariate Analysis EDD
summary(df) #EDD 

boxplot(df$n_hot_rooms)

pairs(~df$Sold+df$rainfall)
barplot(table(df$airport))
barplot(table(df$bus_ter)) #SINCE OF ONE RESPONSE SO IT IS USELESS

#It is shown fromm the descriptive analysis that crime_rate,rainfall and n_hot_room have outliers
#Let solve the outlier problem

# We will be using the capping and floating technique

#n_hot_room has outlier in the upper value
quantile(df$n_hot_rooms, 0.99)
uv <- 3 * quantile(df$n_hot_rooms, 0.99)
df$n_hot_rooms[df$n_hot_rooms> uv] <- uv

summary(df$n_hot_rooms)

#RAINfall has outlier in the lower part
lv = 0.3*quantile(df$rainfall, 0.01)
df$rainfall[df$rainfall<lv] <- lv
summary(df$rainfall)

pairs(~df$price+df$rainfall)

# Treating missing value
mean(df$n_hos_beds)
mean(df$n_hos_beds, na.rm = T)
which(is.na(df$n_hos_beds))
df$n_hos_beds[is.na(df$n_hos_beds)] <- mean(df$n_hos_beds, na.rm = T)

summary(df$n_hos_beds)

#Transformasion of variable
#Transforming related variable to one new created variable by taking the avarage

df$avg_dist = (df$dist1+df$dist2+df$dist3+df$dist4)/4

# we delete the variable (dist1, dist2 etc) and assign to df2
df2 <- df[,-6:-9]
df <- df2

rm(df2) # Remove df2

#Remove useless variable
df <- df[,-13] # Bus terminal

#Dummy variable creation and delete the no variable
#install.packages("dummy")
library(dummies)
df <- dummy.data.frame(df)
df <- df[,-8]
df <- df[,-13]
# THIS IS THE END OF DATA TRANSFORMATION AND EDD/EDA



# Logistic Regression with single predictor

glm.fit = glm(df$Sold~df$price, family = binomial)
summary(glm.fit)

# Logistic Regression with multiple predictor

glm.fit = glm(Sold~., data = df, family = binomial)
summary(glm.fit)

#Find the probability if the house will be sold in 3 months or not
#Value of other predictor will be used
#The result produced a probability that there is percent chance of selling 
#the house within 3 months
glm.probs = predict(glm.fit, type = "response")
glm.probs[1:10] # To check the top 10

#Create the confusion Matrix
#Seting a boundary in order to assign class to the value
# We can say that boundary condition isgreater than 0.5 as 'yes'
#that is house will be sold every three month and 'No' is otherwise
glm.pred = rep("NO", 506)
glm.pred[glm.probs>0.5] = "YES"

#Now create the confusion matrix
table(glm.pred, df$Sold)

#Linear Discriminant Analysis to create Cunfusion Matrix
lda.fit = lda(Sold~., data = df)
lda.fit

#The predicted probability using LDA
lda.pred = predict(lda.fit, df)
lda.pred$posterior

lda.class = lda.pred$class
table(lda.class, df$Sold)

sum(lda.pred$posterior[ ,1]>0.8)



#Quadratic Discriminant Analysis to create Cunfusion Matrix
qda.fit = qda(Sold~., data = df)
qda.fit

#The predicted probability using LDA
qda.pred = predict(qda.fit, df)
qda.pred$posterior

qda.class = qda.pred$class
table(qda.class, df$Sold)

sum(qda.pred$posterior[ ,1]>0.8)

#Train-Test Split install caTools package
#Create the confusion matrix to check performance of our model
set.seed(0)
split = sample.split(df, SplitRatio = 0.8)
train_set = subset(df, split == TRUE)
test_set = subset(df, split == FALSE)

train.fit = glm(Sold~., data = train_set, family = binomial)
test.probs = predict(train.fit, test_set, type = 'response')

test.pred = rep('NO', 120) # the 120 is the observation for test after splitting
test.pred[test.probs>0.5] = 'YES'
table(test.pred, test_set$Sold)

#KNN- K Nearest Neighbors classier
#install class package
trainX = train_set[, -16]
testX = test_set[, -16]
trainY = train_set$Sold
testY = test_set$Sold

k=1

#set standardization of all independent variable before puting it in the model
trainX_s = scale(trainX)
testX_s = scale(testX)

set.seed(0)

knn.pred = knn(trainX_s, testX_s, trainY, k = k)

table(knn.pred, testY)
