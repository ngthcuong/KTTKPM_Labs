# FROM mongo:latest
# COPY /data/init-data.js /docker-entrypoint-initdb.d/

FROM node:18-alpine
WORKDIR /app
COPY package*.json ./
RUN npm install
COPY . .
EXPOSE 8081
CMD ["node", "server.js"] 