(ns meetup)

(def digit-prefix
  ["hena"
   "do"
   "tria"
   "tetra"
   "penta"
   "hexa"
   "hepta"
   "octa"
   "ennea"])

(def place-prefix
  [""
   "conta"
   "hecta"
   "chilia"
   "myria"
   "decamyria"
   "mega"
   "giga"
   "tera"])

(defn lookup-prefix [index digit]
  (let [d (-> digit str (Integer/parseInt) dec)
        value (str (get digit-prefix d) (get place-prefix index))]
    (print value)
    value))

(defn polygon-name* [n]
  (let [reversed (into [] (-> n str reverse))]
    (str (apply str (reverse (map-indexed lookup-prefix reversed)))
         "gon")))

(defn polygon-name
  [n]
  (case n
    1 "henagon"
    2 "digon"
    3 "triangle"
    4 "quadrilateral"
    9 "nonagon"
    10 "decagon"
    11 "hendecagon"
    (polygon-name* n)))

(def n "13493")
