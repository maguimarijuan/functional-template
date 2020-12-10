FROM clojure

WORKDIR /app
COPY . .

CMD ["lein", "test"]