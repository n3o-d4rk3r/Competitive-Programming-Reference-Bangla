const lines = ["1, 3, 4, 7, 13", "1, 2, 4, 13, 15"]//Input

const mapArrayToHashTable = items => {
  return items.reduce((last, item) => ({...last, [''+item]: item}), {}) 
}

const getHashTable = line => {
  const textNumbers = line.split(',')
  const numbers = textNumbers.map(number => parseInt(number))
  return mapArrayToHashTable(numbers)
}

const [firstTable, ...otherTables] = lines.map(getHashTable)

const result = otherTables.reduce((last, table) => {
  const keyObjs = Object.keys(table).map(key => last[key] ? {[key]: last[key]} : {})
  return keyObjs.reduce((last, keyObj) => ({...last, ...keyObj}), {})
}, firstTable)

console.log(Object.values(result)) // returns [1,4,13]