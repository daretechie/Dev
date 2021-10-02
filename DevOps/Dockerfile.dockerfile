FROM centos

ENV GITHUB  https://github.com/mdn/beginner-html-site-styled/archive/refs/heads/gh-pages.zip
ENV 




FROM nginx

WORKDIR /usr/share/nginx/html/

RUN rm .

CMD ["nginx", "-g", "daemon off;"]

