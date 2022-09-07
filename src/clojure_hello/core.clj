(ns clojure-hello.core
  (:require [java-time :as jt])
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

(-main)

(+ 3 4)

(jt/local-date)
(jt/local-time)
(jt/local-date-time)

