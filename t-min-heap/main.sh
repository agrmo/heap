mkdir -p classes
javac -d classes $(find src -type f) && java -cp classes haufen.klein.t.Main
