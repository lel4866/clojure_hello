(ns clojure-hello.core
  (:require [java-time :as jt])
  (:gen-class))

(defn mypline [mystr]
  "replacement for println since println doest display in gvim on Windows"
  (print (str mystr "\n"))) 

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (def a (conj args "grt"))
  (mypline a)
  ;; (println "hello")
  (+ 2 3))

(-main "abc" "def")

(+ 3 54 37)

(jt/local-date)
(jt/local-time)
(jt/local-date-time)

(+ 2 3)

(mypline [1 2 3])

