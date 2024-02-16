type Cbfunction = (item: string) => string;

function mapStrings(array: string[], callbackfn: Cbfunction): string[] {
  const mapArray: string[] = [];

  for (let i = 0; i < array.length; i++) {
    mapArray.push(callbackfn(array[i]));
  }
  return mapArray;
}

const normalStrings: string[] = ['a', 'b', 'c'];
const mappedStrings: string[] = mapStrings(normalStrings, (item: string) =>
  item.toUpperCase(),
);

console.log(normalStrings);
console.log(mappedStrings);
