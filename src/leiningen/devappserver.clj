(ns leiningen.devappserver
  "Launch development app server"
  (:require [leiningen.compile])
  (:import [com.google.appengine.tools KickStart]
           [com.google.appengine.tools.development DevAppServerMain]))

(defn devappserver
  "Launch development app server
Arguments are the same as dev_appserver.
Run with no arguments to see help."
  [project & args]
  (leiningen.compile/compile project)
  (KickStart/main
   (into-array String
               (cons "com.google.appengine.tools.development.DevAppServerMain"
                     args))))
