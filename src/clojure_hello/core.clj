(ns clojure-hello.core
  (:require [java-time :as jt])
  (:gen-class))

(defn mypline
  "replacement for println since println doest display in gvim on Windows"
  [mystr]
  (print (str mystr "\n")))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (let [a (conj args "grt")]
    (mypline a))
  ;; (println "hello")
  (+ 2 3))

(-main "abc" "def")

(+ 3 54 37)

(jt/local-date)
(jt/local-time)
(jt/local-date-time)

(+ 2 3)

(mypline [1 2 3])

