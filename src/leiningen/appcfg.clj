(ns leiningen.appcfg
  "Launch appcfg tool"
  (:require [leiningen.compile])
  (:import [com.google.appengine.tools.admin AppCfg]))

(defn appcfg
  "Launch appcfg tool
Arguments are the same as appcfg.
Run with no arguments to see help."
  [project & args]
  (leiningen.compile/compile project)
  (AppCfg/main
   (into-array String args)))
