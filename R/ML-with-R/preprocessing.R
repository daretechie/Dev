df <- read.csv("C:/Users/DHREY/R_WorkSpace/Complete Machine Learning with R Studio - ML for 2020/data/House_Price.csv", header = T)

#Univariate Analysis EDD
summary(df)

hist(df$crime_rate)
pairs(~df$price+df$crime_rate+df$n_hot_rooms+df$rainfall)
barplot(table(df$waterbody))

#It is shown fromm the descriptive analysis that crime_rate,rainfall and n_hot_room have outliers
#Let solve the outlier problem

# We will be using the capping and floating technique
 
#n_hot_room has outlier in the upper value
quantile(df$n_hot_rooms, 0.99)
uv <- 3 * quantile(df$n_hot_rooms, 0.99)
df$n_hot_rooms[df$n_hot_rooms> uv] <- uv

summary(df$n_hot_rooms)

#RAINfall has outlier in the lower part
lv = 0.9*quantile(df$rainfall, 0.01)
df$rainfall[df$rainfall<lv] <- lv
summary(df$rainfall)
pairs(~df$price+df$rainfall)

# Treating missing value
mean(df$n_hos_beds)
mean(df$n_hos_beds, na.rm = T)
which(is.na(df$n_hos_beds))
df$n_hos_beds[is.na(df$n_hos_beds)] <- mean(df$n_hos_beds, na.rm = T)

summary(df$n_hos_beds)

#Transforming crime_rate. Note that there is log relationship btw price and crime rate and its has ouliers
pairs(~df$price+df$crime_rate)
plot(df$price, df$crime_rate)

df$crime_rate=log(1+df$crime_rate)

#Transforming related variable to one new created variable by taking the avarage

df$avg_dist = (df$dist1+df$dist2+df$dist3+df$dist4)/4

#we delete the variable (dist1, dist2 etc) and assign to df
df2 <- df[,-7:-10]
df <- df2

rm(df2)

#Remove useless variable
df <- df[,-14]

#Dummy variable creation and delete the no varable
#install.packages("dummy")
library(dummies)
df <- dummy.data.frame(df)
df <- df[,-9]
df <- df[,-14]

#Correlation Matrix 
round(cor(df), 2)
df <- df[,-16] # Delete the park variable since it is not needed

#Simple Regression
simple_model <- lm(price~room_num, data=df)

summary(simple_model)
plot(df$room_num, df$price)
abline(simple_model)


#Multiple regressionn
mul_model = lm(price~., data=df)
summary(mul_model)

# 7 variables reveal that they will have either negative or positive impact on the price of house
#iNTERPRETATION: A unit increase in air_qual will lead to a decrease value in the price of house.
#           Also, A unit increase in room_num will lead to an increase value in the price of house

#Install caTools package

#Set seed  and slipt the data

set.seed(0)
split = sample.split(df, SplitRatio = 0.8)
training_set = subset(df, split == TRUE)
test_set = subset(df, split == FALSE)

#Multiple linear Regression 
lm_a = lm(price~., data=training_set)

#Find the mean Estimated Error, to do that first --->
# Predict the value of the train and test dependent variable
train_a = predict(lm_a, training_set)
test_a = predict(lm_a, test_set)

#Find the mean estimated error
mean((training_set$price-train_a)^2)
mean((test_set$price-test_a)^2)
 

#Training the model using the SUBSET selection technique
#Using the Best method
#install leaps package
lm_best = regsubsets(price~.,data = df, nvmax = 15)
summary(lm_best)
summary(lm_best)$adjr2 #with the adjusted R^2
which.max(summary(lm_best)$adjr2)
coef(lm_best, 8) # to see the coefficient of the variable

#Using the forward method
lm_forward = regsubsets(price~.,data = df, nvmax = 15, method = "forward")
summary(lm_forward)
summary(lm_forward)$adjr2
which.max(summary(lm_forward)$adjr2) # To the maximum
coef(lm_forward, 15)

#Using Backward Method
lm_backward = regsubsets(price~.,data = df, nvmax = 15, method = "backward")
summary(lm_backward)
summary(lm_backward)$adjr2
which.max(summary(lm_backward)$adjr2) # To the maximum
coef(lm_backward, 15)


#Train the Model using Shrinkage Method
#Install glmnet
x = model.matrix(price~., data = df)[,-1] # [,-1] indicate that we dont want it since it is the price colon
y = df$price
grid = 10^seq(10, -2, length =100)

grid

#Using the Ridge regression method
lm_ridge = glmnet(x,y, alpha = 0, lambda =grid)
summary(lm_ridge)
cv_fit = cv.glmnet(x, y, alpha = 0, lambda = grid)
plot(cv_fit)

opt_lambda = cv_fit$lambda.min
tss = sum((y - mean(y))^2)

y_a = predict(lm_ridge, s = opt_lambda, newx = x)

rss = sum((y_a-y)^2)

rsq = 1 - rss/tss


# Using the Lasso method
lm_lasso = glmnet(x,y, alpha = 1, lambda =grid)
summary(lm_lasso)
cv_fit = cv.glmnet(x, y, alpha = 1, lambda = grid)
plot(cv_fit)

opt_lambda = cv_fit$lambda.min
tss = sum((y - mean(y))^2)

y_a = predict(lm_ridge, s = opt_lambda, newx = x)

rss = sum((y_a-y)^2)

rsq = 1 - rss/tss

