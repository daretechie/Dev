FROM centos:latest

RUN yum -y install httpd

COPY /home/ec2-user/JS_project/JavaScript-by-Example-master/Chapter01/* /var/www/html/

CMD [“/usr/sbin/httpd”, “-D”, “FOREGROUND”]

EXPOSE 80


#####################################################################################
#                                                                                   #
#####################################################################################
FROM centos

RUN yum -y install httpd


RUN yum -y install nodejs

WORKDIR /var/www/html

COPY package*.json ./

RUN npm install

COPY . .

RUN npm run build

CMD apachectl -DFOREGROUND