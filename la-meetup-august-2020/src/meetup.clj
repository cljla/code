(ns meetup)

(def digit-prefix
  [
   "hena"
   "do"
   "tria"
   "tetra"
   "penta"
   "hexa"
   "hepta"
   "octa"
   "ennea"
   ])

(def place-prefix
  [
   ""
   "conta"
   "hecta"
   "chilia"
   "myria"
   "decamyria"
   "mega"
   "giga"
   "tera"
   ])

(defn polygon-name
  [n]
  (case n
    3 "triangle"
    4 "quadrilateral"
    )
  )

(def n "13493")

(into [] (reverse n))
